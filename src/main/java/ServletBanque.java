import ClassModel.Model;
import com.Metier.BanqueClass;
import com.Metier.BanqueInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "ServletBanque", urlPatterns = {"*.php"})
public class ServletBanque extends HttpServlet {
    // on declare un objet de l interface pour qu'il soit un objet unique
    private BanqueInterface metier ;


  public void init(){
      // mtn le controleur est lie avec la couche metier
      metier=new BanqueClass();

  }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("monMod", new Model());
        request.getRequestDispatcher("View.jsp").forward(request,response);
    }


    @Override
    // pour recuperer les donnes de formulaire
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      // Valider les parametres cote serveur
        double M= Double.parseDouble(request.getParameter("Montant"));
        double T=Double.parseDouble(request.getParameter("Taux"));
        int D=Integer.parseInt(request.getParameter("Duree"));
        // mtn on va stocker les param de la vue vers le modele
        Model monModel= new Model();
        monModel.setCapital(M);
        monModel.setTaux(T);
        monModel.setDuree(D);

        // appel de la couche metier
        double resultat = metier.CalculerMensualiteBanque(M,T,D);
        // mtn le resultat on va le stocker dans le model
        monModel.setMensualite(resultat);
        // On doit stocker le resultat de model dans L objet request pour qu'il soit transmis en Vue
        request.setAttribute("BanqueModel",monModel);
        // enfin , on fait un forward vers la vue
        request.getRequestDispatcher("View.jsp").forward(request,response);

    }
}
