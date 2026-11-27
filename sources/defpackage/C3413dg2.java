package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.impl.core.backend.modelsResponse.SID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3413dg2<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ C4720jg2 e;

    /* JADX INFO: renamed from: dg2$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl$connectNamespace$$inlined$filter$1$2", f = "WebSocketConnectionDataSourceImpl.kt", l = {219}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C3413dg2.this.a(null, this);
        }
    }

    public C3413dg2(InterfaceC6606sf0 interfaceC6606sf0, C4720jg2 c4720jg2) {
        this.d = interfaceC6606sf0;
        this.e = c4720jg2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj2 = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            JsonElement jsonElement = (JsonElement) obj;
            this.e.getClass();
            jsonElement.getClass();
            if (jsonElement instanceof JsonObject) {
                C7817yQ0<String, JsonElement> c7817yQ0 = jsonElement.d().d;
                if (c7817yQ0.containsKey("sid") && !c7817yQ0.containsKey("pingInterval")) {
                    aVar.e = 1;
                    if (this.d.a(obj, aVar) == mn) {
                        return mn;
                    }
                }
            } else if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitiveE = jsonElement.e();
                if ((jsonPrimitiveE.d instanceof Number) && Intrinsics.a(jsonPrimitiveE.f(), SID.NAME)) {
                    aVar.e = 1;
                    if (this.d.a(obj, aVar) == mn) {
                        return mn;
                    }
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
