package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6457rx<T> extends PH<T> {

    @NotNull
    public final InterfaceC1210Ih0<T> b;

    @NotNull
    public final C7436wc1<T> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6457rx(@NotNull ArrayList formats) {
        super(formats);
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.b = super.a();
        this.c = super.b();
    }

    @Override // defpackage.PH, defpackage.InterfaceC1132Hh0
    @NotNull
    public final InterfaceC1210Ih0<T> a() {
        return this.b;
    }

    @Override // defpackage.PH, defpackage.InterfaceC1132Hh0
    @NotNull
    public final C7436wc1<T> b() {
        return this.c;
    }
}
