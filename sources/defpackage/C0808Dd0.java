package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0808Dd0 implements InterfaceC0652Bd0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC0652Bd0
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final Object a(@NotNull Context context, @NotNull LM lm) throws Exception {
        C0730Cd0 c0730Cd0;
        if (lm instanceof C0730Cd0) {
            c0730Cd0 = (C0730Cd0) lm;
            int i = c0730Cd0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0730Cd0.g = i - Integer.MIN_VALUE;
            } else {
                c0730Cd0 = new C0730Cd0(this, lm);
            }
        } else {
            c0730Cd0 = new C0730Cd0(this, lm);
        }
        Object objF = c0730Cd0.d;
        MN mn = MN.d;
        int i2 = c0730Cd0.g;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objF);
                Task<String> taskA = FirebaseAnalytics.getInstance(context).a();
                Intrinsics.checkNotNullExpressionValue(taskA, "getAppInstanceId(...)");
                c0730Cd0.g = 1;
                objF = C0957Fb.f(taskA, c0730Cd0);
                if (objF == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objF);
            }
            String str = (String) objF;
            return str == null ? "" : str;
        } catch (NullPointerException unused) {
            return "";
        }
    }
}
