package k.k.k.repository;

import k.k.k.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {

}
