package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class WrongCaptcha_Factory implements InterfaceC5331mb0<WrongCaptcha> {

    public static final class InstanceHolder {
        private static final WrongCaptcha_Factory INSTANCE = new WrongCaptcha_Factory();
    }

    public static WrongCaptcha_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new WrongCaptcha();
    }
}
