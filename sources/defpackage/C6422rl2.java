package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6422rl2 implements InterfaceC6396rf0<C0919Eo0<Object>> {
    public final /* synthetic */ C4250hg0 d;
    public final /* synthetic */ String e;

    /* JADX INFO: renamed from: rl2$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: rl2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$filterByPrevName$$inlined$filter$1$2", f = "WsApiUtils.kt", l = {219}, m = "emit")
        public static final class C0484a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0484a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0, String str) {
            this.d = interfaceC6606sf0;
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0484a c0484a;
            String string;
            if (jm instanceof C0484a) {
                c0484a = (C0484a) jm;
                int i = c0484a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0484a.e = i - Integer.MIN_VALUE;
                } else {
                    c0484a = new C0484a(jm);
                }
            } else {
                c0484a = new C0484a(jm);
            }
            Object obj2 = c0484a.d;
            MN mn = MN.d;
            int i2 = c0484a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                JsonElement jsonElement = (JsonElement) ((C0919Eo0) obj).a;
                boolean zA = false;
                if (jsonElement != null && (jsonElement instanceof JsonArray) && jsonElement.c().d.size() == 2) {
                    JsonElement jsonElementH = jsonElement.c().h(0);
                    jsonElementH.getClass();
                    boolean z = jsonElementH instanceof JsonPrimitive;
                    if (z && (jsonElementH.e().d instanceof String)) {
                        string = jsonElementH.e().f().toString();
                    } else if (z) {
                        string = jsonElementH.toString();
                        Intrinsics.checkNotNull(string);
                    } else {
                        string = "";
                    }
                    zA = Intrinsics.a(string, this.e);
                }
                if (zA) {
                    c0484a.e = 1;
                    if (this.d.a(obj, c0484a) == mn) {
                        return mn;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj2);
            }
            return Unit.a;
        }
    }

    public C6422rl2(C4250hg0 c4250hg0, String str) {
        this.d = c4250hg0;
        this.e = str;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super C0919Eo0<Object>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
