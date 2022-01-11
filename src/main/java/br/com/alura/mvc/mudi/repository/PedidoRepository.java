package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	List<Pedido> findByStatus(StatusPedido status);
	
//	@Autowired
//	EntityManager entityManager;
//	
//	public List<Pedido> retornaTodosPedidos(){
//		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);		
//		List<Pedido> pedidos = query.getResultList();	
//		return pedidos;
//	}
}
