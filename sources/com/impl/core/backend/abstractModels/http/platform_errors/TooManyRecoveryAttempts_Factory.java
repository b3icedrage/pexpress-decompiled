package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class TooManyRecoveryAttempts_Factory implements InterfaceC5331mb0<TooManyRecoveryAttempts> {

    public static final class InstanceHolder {
        private static final TooManyRecoveryAttempts_Factory INSTANCE = new TooManyRecoveryAttempts_Factory();
    }

    public static TooManyRecoveryAttempts_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new TooManyRecoveryAttempts();
    }
}
