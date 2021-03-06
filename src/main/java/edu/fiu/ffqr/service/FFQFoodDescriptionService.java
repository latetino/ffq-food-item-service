package edu.fiu.ffqr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.models.FoodDescription;
import edu.fiu.ffqr.repositories.FFQFoodDescriptionRepository;

@Service
@Component
public class FFQFoodDescriptionService {

    @Autowired
    private FFQFoodDescriptionRepository foodDescriptionRepository;

    public List<FoodDescription> getAll()	{
        return foodDescriptionRepository.findAll();
    }

    public FoodDescription create(FoodDescription foodDescription) {
        return foodDescriptionRepository.save(foodDescription);
    }

    public FoodDescription findByFoodItemGroupName(String foodItemGroupName) {
		    return foodDescriptionRepository.findByFoodItemGroupName(foodItemGroupName);
    }
}