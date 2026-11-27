package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6959uK1 extends ML0 implements Function0<SharedPreferences> {
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6959uK1(Context context, String str) {
        super(0);
        this.d = context;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.d.getSharedPreferences(this.e, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
