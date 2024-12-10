// Generated by Dagger (https://dagger.dev).
package com.prime.toolz.impl;

import androidx.compose.material3.SnackbarHostState;
import com.primex.preferences.Preferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class UnitConverterViewModel_Factory implements Factory<UnitConverterViewModel> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<SnackbarHostState> channelProvider;

  public UnitConverterViewModel_Factory(Provider<Preferences> preferencesProvider,
      Provider<SnackbarHostState> channelProvider) {
    this.preferencesProvider = preferencesProvider;
    this.channelProvider = channelProvider;
  }

  @Override
  public UnitConverterViewModel get() {
    return newInstance(preferencesProvider.get(), channelProvider.get());
  }

  public static UnitConverterViewModel_Factory create(Provider<Preferences> preferencesProvider,
      Provider<SnackbarHostState> channelProvider) {
    return new UnitConverterViewModel_Factory(preferencesProvider, channelProvider);
  }

  public static UnitConverterViewModel newInstance(Preferences preferences,
      SnackbarHostState channel) {
    return new UnitConverterViewModel(preferences, channel);
  }
}
