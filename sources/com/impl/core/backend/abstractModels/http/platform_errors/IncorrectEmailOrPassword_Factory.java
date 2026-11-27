package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectEmailOrPassword_Factory implements InterfaceC5331mb0<IncorrectEmailOrPassword> {

    public static final class InstanceHolder {
        private static final IncorrectEmailOrPassword_Factory INSTANCE = new IncorrectEmailOrPassword_Factory();
    }

    public static IncorrectEmailOrPassword_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new IncorrectEmailOrPassword();
    }
}
