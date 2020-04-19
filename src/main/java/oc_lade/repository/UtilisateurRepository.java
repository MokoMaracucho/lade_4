package oc_lade.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oc_lade.entity.Utilisateur;

@Repository("utilisateurRepository")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, UUID> {

//	@Override
//	<S extends Utilisateur> S save(S entity);
//
//	@Override
//	Optional<Utilisateur> findById(UUID id);
//
//	@Override
//	boolean existsById(UUID id);
//
//	@Override
//	long count();
//
//	@Override
//	void deleteById(UUID id);
//
//	@Override
//	void delete(Utilisateur entity);
//
//	@Override
//	void deleteAll(Iterable<? extends Utilisateur> entities);
//
//	@Override
//	void deleteAll();
//
//	@Override
//	<S extends Utilisateur> Optional<S> findOne(Example<S> example);
//
//	@Override
//	<S extends Utilisateur> Page<S> findAll(Example<S> example, Pageable pageable);
//
//	@Override
//	<S extends Utilisateur> long count(Example<S> example);
//
//	@Override
//	<S extends Utilisateur> boolean exists(Example<S> example);
//
//	@Override
//	Page<Utilisateur> findAll(Pageable pageable);
//
//	@Override
//	List<Utilisateur> findAll();
//
//	@Override
//	List<Utilisateur> findAll(Sort sort);
//
//	@Override
//	List<Utilisateur> findAllById(Iterable<UUID> ids);
//
//	@Override
//	<S extends Utilisateur> List<S> saveAll(Iterable<S> entities);
//
//	@Override
//	void flush();
//
//	@Override
//	<S extends Utilisateur> S saveAndFlush(S entity);
//
//	@Override
//	void deleteInBatch(Iterable<Utilisateur> entities);
//
//	@Override
//	void deleteAllInBatch();
//
//	@Override
//	Utilisateur getOne(UUID id);
//
//	@Override
//	<S extends Utilisateur> List<S> findAll(Example<S> example);
//
//	@Override
//	<S extends Utilisateur> List<S> findAll(Example<S> example, Sort sort);
	
}
