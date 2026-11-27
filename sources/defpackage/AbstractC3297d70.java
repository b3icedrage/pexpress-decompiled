package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3297d70 extends CK1 {
    public abstract void e(@Nullable InterfaceC4005gW1 interfaceC4005gW1, Object obj);

    public void f(Object obj) {
        InterfaceC4005gW1 interfaceC4005gW1A = a();
        try {
            e(interfaceC4005gW1A, obj);
            interfaceC4005gW1A.p1();
        } finally {
            d(interfaceC4005gW1A);
        }
    }
}
