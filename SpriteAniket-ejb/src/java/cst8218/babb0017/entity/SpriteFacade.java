/*
 * File name: SpriteFacade.java
 * Author: Aniket Babbar
`* Student Number: 040957207
 * Course: CST8218 - Web Enterprise Application, Section: 300
 * Professor: Todd Kelley
 * Assignment: 1
 * Date: 26th March, 2021
 * Purpose: Sprite Facade class
 */
package cst8218.babb0017.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tgk
 */
@Stateless
public class SpriteFacade extends AbstractFacade<Sprite> {
    @PersistenceContext(unitName = "SpriteAniketPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpriteFacade() {
        super(Sprite.class);
    }
    
}
