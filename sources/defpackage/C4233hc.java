package defpackage;

import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: renamed from: hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4233hc implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C4233hc(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            default:
                return BG.a(C6927uA.d((Charset) obj), C6927uA.d((Charset) obj2));
        }
    }
}
