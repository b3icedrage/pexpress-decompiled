package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class CaptchaRequired_Factory implements InterfaceC5331mb0<CaptchaRequired> {

    public static final class InstanceHolder {
        private static final CaptchaRequired_Factory INSTANCE = new CaptchaRequired_Factory();
    }

    public static CaptchaRequired_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new CaptchaRequired();
    }
}
