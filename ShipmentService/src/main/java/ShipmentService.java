public class ShipmentService {
    public final static int BASIC_COST = 5;

    @PersistenceContext
    private EntityManager em;

    public int getShippingCosts(int loadId) {
        Load load = em.find(Load.class, loadId);
        return computeShippingCost(load);
    }

