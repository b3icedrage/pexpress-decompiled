package defpackage;

import java.text.DateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1929Rm0 extends Vc2 {

    @NotNull
    public final GP1 a;
    public final DateFormat b;

    public C1929Rm0(@NotNull GP1 startTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.a = startTime;
        this.b = DateFormat.getTimeInstance(2, Locale.UK);
    }

    @Override // defpackage.Vc2
    @Nullable
    public final String a(float f) {
        return this.b.format(Long.valueOf(((Number) this.a.getValue()).longValue() + ((long) f)));
    }
}
