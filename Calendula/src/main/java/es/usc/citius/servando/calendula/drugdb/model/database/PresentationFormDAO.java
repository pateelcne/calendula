/*
 *    Calendula - An assistant for personal medication management.
 *    Copyright (C) 2016 CITIUS - USC
 *
 *    Calendula is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this software.  If not, see <http://www.gnu.org/licenses>.
 */

package es.usc.citius.servando.calendula.drugdb.model.database;

import android.util.Log;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import es.usc.citius.servando.calendula.database.DatabaseHelper;
import es.usc.citius.servando.calendula.database.GenericDao;
import es.usc.citius.servando.calendula.drugdb.model.persistence.PresentationForm;

/**
 * This class was generated automatically.
 * Please check its consistency and completeness carefully.
 */
public class PresentationFormDAO extends GenericDao<PresentationForm, Long> {

    public static final String TAG = "PresentationFormDAO";

    private Dao<PresentationForm, Long> daoInstance = null;

    public PresentationFormDAO(DatabaseHelper db) {
        super(db);
    }

    @Override
    public Dao<PresentationForm, Long> getConcreteDao() {
        try {
            if (daoInstance == null)
                daoInstance = dbHelper.getDao(PresentationForm.class);
            return daoInstance;
        } catch (SQLException e) {
            Log.e(TAG, "Error creating PresentationForm DAO", e);
            throw new RuntimeException("Error creating PresentationForm DAO", e);
        }
    }


}