package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class EmailRecoveryAlreadySent_Factory implements InterfaceC5331mb0<EmailRecoveryAlreadySent> {

    public static final class InstanceHolder {
        private static final EmailRecoveryAlreadySent_Factory INSTANCE = new EmailRecoveryAlreadySent_Factory();
    }

    public static EmailRecoveryAlreadySent_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new EmailRecoveryAlreadySent();
    }
}
