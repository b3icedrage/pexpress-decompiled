package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8050zY implements Comparable<AbstractC8050zY> {
    @NotNull
    public abstract void b();

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC8050zY abstractC8050zY) {
        AbstractC8050zY other = abstractC8050zY;
        Intrinsics.checkNotNullParameter(other, "other");
        b();
        AY ay = AY.d;
        other.b();
        return ay.compareTo(ay);
    }
}
