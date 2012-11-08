package org.lightadmin.core.config.bootstrap.parsing.configuration;

import org.lightadmin.core.config.domain.configuration.EntityMetadataConfigurationUnit;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnit;
import org.lightadmin.core.config.domain.filter.FiltersConfigurationUnit;
import org.lightadmin.core.config.domain.fragment.ListViewConfigurationUnit;
import org.lightadmin.core.config.domain.scope.ScopesConfigurationUnit;
import org.lightadmin.core.persistence.metamodel.DomainTypeEntityMetadata;

public interface DomainConfigurationSource {

	Class<?> getDomainType();

	String getConfigurationName();

	DomainTypeEntityMetadata getDomainTypeEntityMetadata();

	FiltersConfigurationUnit getFilters();

	ScopesConfigurationUnit getScopes();

	ListViewConfigurationUnit getListViewFragment();

	ScreenContextConfigurationUnit getScreenContext();

	EntityMetadataConfigurationUnit getEntityConfiguration();
}