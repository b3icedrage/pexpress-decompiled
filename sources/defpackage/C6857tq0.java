package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6857tq0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object old, Object obj) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Integer.valueOf(((Integer) old).intValue() + 1);
    }
}
