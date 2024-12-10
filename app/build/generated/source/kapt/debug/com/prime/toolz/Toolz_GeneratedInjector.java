package com.prime.toolz;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = Toolz.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface Toolz_GeneratedInjector {
  void injectToolz(Toolz toolz);
}
