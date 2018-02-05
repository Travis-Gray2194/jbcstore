package me.travisgray.Repositories;
import org.springframework.data.repository.CrudRepository;
import me.travisgray.Models.CleaningItems;

/**
 * Created by ${TravisGray} on 2/5/2018.
 */
public interface CleaningItemsRepository extends CrudRepository<CleaningItems,Long> {
}
