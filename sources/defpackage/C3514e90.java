package defpackage;

import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3514e90<T> implements Comparator {
    public final /* synthetic */ C4144h90 a;

    public C3514e90(C4144h90 c4144h90) {
        this.a = c4144h90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        File it = (File) t;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        C4144h90 c4144h90 = this.a;
        String strA = C4144h90.a(c4144h90, it);
        File it2 = (File) t2;
        Intrinsics.checkNotNullExpressionValue(it2, "it");
        return BG.a(strA, C4144h90.a(c4144h90, it2));
    }
}
