package defpackage;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2944bS0 extends C2720aS0.h<Object> {
    public final /* synthetic */ C5653o60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2944bS0(C2720aS0 c2720aS0, Function0 function0, C5653o60 c5653o60) {
        super(c2720aS0, function0);
        this.h = c5653o60;
        if (c2720aS0 != null) {
        } else {
            C2720aS0.h.a(0);
            throw null;
        }
    }

    @Override // defpackage.C2720aS0.f
    @NotNull
    public final C2720aS0.m<Object> d(boolean z) {
        return new C2720aS0.m<>(false, this.h);
    }
}
