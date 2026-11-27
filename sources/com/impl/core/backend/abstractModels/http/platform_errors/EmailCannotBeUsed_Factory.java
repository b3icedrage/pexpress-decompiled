package com.impl.core.backend.abstractModels.http.platform_errors;

import defpackage.InterfaceC5331mb0;

/* JADX INFO: loaded from: classes.dex */
public final class EmailCannotBeUsed_Factory implements InterfaceC5331mb0<EmailCannotBeUsed> {

    public static final class InstanceHolder {
        private static final EmailCannotBeUsed_Factory INSTANCE = new EmailCannotBeUsed_Factory();
    }

    public static EmailCannotBeUsed_Factory a() {
        return InstanceHolder.INSTANCE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new EmailCannotBeUsed();
    }
}
