package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class K41 implements InterfaceC6353rS1 {

    @NotNull
    public final Context a;

    @NotNull
    public final EnumC2694aJ1 b;

    @NotNull
    public final C6610sg0 c;

    @InterfaceC3368dU(c = "com.base.feature.support.chat.data.NicknameSessionValue$valueFlow$1", f = "NicknameSessionValue.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<C6945uG, C6106qG, JM<? super String>, Object> {
        public /* synthetic */ C6945uG d;
        public /* synthetic */ C6106qG e;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C6945uG c6945uG = this.d;
            C6106qG c6106qG = this.e;
            K41 k41 = K41.this;
            k41.getClass();
            String str = c6106qG != null ? c6106qG.b : null;
            if (str == null) {
                str = "";
            }
            if (str.length() != 0) {
                return str;
            }
            String str2 = c6945uG != null ? c6945uG.c : null;
            String str3 = str2 != null ? str2 : "";
            if (str3.length() != 0) {
                return str3;
            }
            String string = k41.a.getString(R.string.trader_demo_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(C6945uG c6945uG, C6106qG c6106qG, JM<? super String> jm) {
            a aVar = K41.this.new a(jm);
            aVar.d = c6945uG;
            aVar.e = c6106qG;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public K41(@NotNull C4923kf appData, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.a = applicationContext;
        this.b = EnumC2694aJ1.NICKNAME_KEY;
        this.c = new C6610sg0(appData.k, appData.c, new a(null));
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        return InterfaceC6353rS1.a.a(this, ta, dVar);
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.c;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.b;
    }
}
