package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7910yr implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C7910yr(Object obj, int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                AbstractC4743jm1.Companion companion = AbstractC4743jm1.INSTANCE;
                C0957Fb.i(companion);
                return companion;
            default:
                C6154qW transmitter = new C6154qW();
                Intrinsics.checkNotNullParameter(transmitter, "transmitter");
                return transmitter;
        }
    }
}
