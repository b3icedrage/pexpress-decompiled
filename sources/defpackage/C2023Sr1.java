package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: Sr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2023Sr1<E> extends AbstractC3946gD {
    public Pattern h;
    public String i;

    public C2023Sr1() {
        super(1);
    }

    @Override // defpackage.AbstractC3946gD
    public final String i(QS0 qs0, String str) {
        return !this.e ? str : this.h.matcher(str).replaceAll(this.i);
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        a("at least two options are expected whereas you have declared none");
    }
}
