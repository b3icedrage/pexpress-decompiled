package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: vC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7144vC0 extends IOException {
    public HZ0 d;

    public C7144vC0(String str) {
        super(str);
        this.d = null;
    }

    public static C7144vC0 a() {
        return new C7144vC0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
