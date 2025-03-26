package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    //Constructor
    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl() {}

    @Override
    public double calcul() {
        double t = dao.getData();
        return t*43/3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
