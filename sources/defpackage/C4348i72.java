package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4348i72 extends C1059Gj {

    @NotNull
    public final AbstractC4649jL0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4348i72(@NotNull List<? extends CK<?>> value, @NotNull AbstractC4649jL0 type) {
        super(value, new E(type, 2));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.c = type;
    }
}
