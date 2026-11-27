package defpackage;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5206lz1 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @Nullable
    public volatile String b;

    /* JADX INFO: renamed from: lz1$a */
    public static final class a implements InterfaceC7031ug1<String> {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final AbstractC0662Bg1.a<String> b = C1052Gg1.d("robot_session_id");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<String> getKey() {
            return b;
        }
    }

    public C5206lz1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.a = preferencesRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object a(@NotNull LM lm) {
        C5416mz1 c5416mz1;
        C5206lz1 c5206lz1;
        Object objA;
        if (lm instanceof C5416mz1) {
            c5416mz1 = (C5416mz1) lm;
            int i = c5416mz1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5416mz1.g = i - Integer.MIN_VALUE;
            } else {
                c5416mz1 = new C5416mz1(this, lm);
            }
        } else {
            c5416mz1 = new C5416mz1(this, lm);
        }
        Object obj = c5416mz1.d;
        MN mn = MN.d;
        int i2 = c5416mz1.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            String str = this.b;
            if (str != null) {
                return str;
            }
            c5206lz1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C1795Pt1.b(obj);
                objA = (String) obj;
                C1717Ot1.a aVar = C1717Ot1.e;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            if (objA instanceof C1717Ot1.b) {
                objA = null;
            }
            if (((String) objA) != null) {
                throw null;
            }
            c5206lz1 = null;
        }
        c5206lz1.getClass();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        c5206lz1.b = string;
        C5189lv.k(C6215qm0.d, null, new C5626nz1(c5206lz1, string, null), 3);
        return string;
    }
}
