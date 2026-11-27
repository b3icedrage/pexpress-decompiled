package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.C5414mz;
import defpackage.InterfaceC7273vp;
import defpackage.SP;
import defpackage.U42;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements InterfaceC7273vp {
    @Override // defpackage.InterfaceC7273vp
    public U42 create(SP sp) {
        return new C5414mz(sp.a(), sp.d(), sp.c());
    }
}
