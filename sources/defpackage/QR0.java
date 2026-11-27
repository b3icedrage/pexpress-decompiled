package defpackage;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class QR0 implements PR0 {
    public final LocaleList a;

    public QR0(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.PR0
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((PR0) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
