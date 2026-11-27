package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7844yZ0 extends RA {
    @NotNull
    public final String a() {
        if (this instanceof L8) {
            return ((L8) this).a.d;
        }
        if (this instanceof TD) {
            return ((TD) this).a.d;
        }
        return this instanceof LF1 ? ((LF1) this).a.d : "";
    }

    @NotNull
    public final String b() {
        if (this instanceof L8) {
            return ((L8) this).a.c;
        }
        return this instanceof TD ? ((TD) this).a.c : "";
    }

    @NotNull
    public abstract AbstractC3926g70 c();

    @NotNull
    public final String d() {
        if (this instanceof L8) {
            return ((L8) this).a.b;
        }
        if (this instanceof TD) {
            return ((TD) this).a.b;
        }
        return this instanceof LF1 ? ((LF1) this).a.c : "";
    }
}
