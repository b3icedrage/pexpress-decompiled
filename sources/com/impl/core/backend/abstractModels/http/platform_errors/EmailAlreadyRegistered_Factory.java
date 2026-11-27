package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class EmailAlreadyRegistered_Factory implements InterfaceC5331mb0<EmailAlreadyRegistered> {

    public static final class InstanceHolder {
        private static final EmailAlreadyRegistered_Factory INSTANCE = new EmailAlreadyRegistered_Factory();
    }

    public static EmailAlreadyRegistered_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new EmailAlreadyRegistered();
    }
}
