package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectAuthCode_Factory implements InterfaceC5331mb0<IncorrectAuthCode> {

    public static final class InstanceHolder {
        private static final IncorrectAuthCode_Factory INSTANCE = new IncorrectAuthCode_Factory();
    }

    public static IncorrectAuthCode_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new IncorrectAuthCode();
    }
}
