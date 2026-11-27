package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class QH0 {

    @NotNull
    public final AbstractC4995l0 a;
    public final boolean b;
    public int c;

    public QH0(@NotNull C7577xG0 configuration, @NotNull AbstractC4995l0 lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.a = lexer;
        this.b = configuration.c;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(QH0 qh0, DU du, AbstractC7487wq abstractC7487wq) {
        PH0 ph0;
        byte bG;
        LinkedHashMap linkedHashMap;
        QH0 qh1;
        byte bF;
        LinkedHashMap linkedHashMap2;
        AbstractC4995l0 abstractC4995l0;
        if (abstractC7487wq instanceof PH0) {
            ph0 = (PH0) abstractC7487wq;
            int i = ph0.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ph0.k = i - Integer.MIN_VALUE;
            } else {
                ph0 = new PH0(qh0, abstractC7487wq);
            }
        } else {
            ph0 = new PH0(qh0, abstractC7487wq);
        }
        Object obj = ph0.i;
        MN mn = MN.d;
        int i2 = ph0.k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = ph0.h;
            linkedHashMap2 = ph0.g;
            qh1 = ph0.e;
            DU du2 = ph0.d;
            C1795Pt1.b(obj);
            linkedHashMap2.put(str, (JsonElement) obj);
            bF = qh1.a.f();
            if (bF == 4) {
                bG = bF;
                qh0 = qh1;
                linkedHashMap = linkedHashMap2;
                du = du2;
            } else if (bF != 7) {
                AbstractC4995l0.r(qh1.a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            abstractC4995l0 = qh1.a;
            if (bF == 6) {
                abstractC4995l0.g((byte) 7);
            } else if (bF == 4) {
                C1874Qu.p(abstractC4995l0, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap2);
        }
        C1795Pt1.b(obj);
        AbstractC4995l0 abstractC4995l1 = qh0.a;
        bG = abstractC4995l1.g((byte) 6);
        if (abstractC4995l1.w() == 4) {
            AbstractC4995l0.r(abstractC4995l1, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        AbstractC4995l0 abstractC4995l2 = qh0.a;
        if (abstractC4995l2.c()) {
            String strL = qh0.b ? abstractC4995l2.l() : abstractC4995l2.j();
            abstractC4995l2.g((byte) 5);
            Unit unit = Unit.a;
            ph0.d = du;
            ph0.e = qh0;
            ph0.g = linkedHashMap;
            ph0.h = strL;
            ph0.k = 1;
            du.a(unit, ph0);
            return mn;
        }
        byte b = bG;
        qh1 = qh0;
        bF = b;
        linkedHashMap2 = linkedHashMap;
        abstractC4995l0 = qh1.a;
        if (bF == 6) {
            abstractC4995l0.g((byte) 7);
        } else if (bF == 4) {
            C1874Qu.p(abstractC4995l0, "object");
            throw null;
        }
        return new JsonObject(linkedHashMap2);
    }

    @NotNull
    public final JsonElement b() {
        JsonElement jsonObject;
        Object obj;
        Object objK;
        AbstractC4995l0 abstractC4995l0 = this.a;
        byte bW = abstractC4995l0.w();
        if (bW == 1) {
            return d(true);
        }
        if (bW == 0) {
            return d(false);
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bW != 6) {
            if (bW == 8) {
                return c();
            }
            AbstractC4995l0.r(abstractC4995l0, "Cannot read Json element because of unexpected ".concat(C5208m0.u(bW)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            OH0 block = new OH0(this, null);
            Intrinsics.checkNotNullParameter(block, "block");
            C1589Ne c1589Ne = new C1589Ne();
            Unit unit = Unit.a;
            MN mn = CU.a;
            Intrinsics.checkNotNullParameter(c1589Ne, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            EU eu = new EU(defaultConstructorMarker);
            eu.d = block;
            eu.e = unit;
            eu.g = eu;
            MN mn2 = CU.a;
            eu.h = mn2;
            while (true) {
                obj = eu.h;
                JM<? super JsonElement> completion = eu.g;
                if (completion == null) {
                    break;
                }
                C1717Ot1.a aVar = C1717Ot1.e;
                if (Intrinsics.a(mn2, obj)) {
                    try {
                        OH0 oh0 = eu.d;
                        Unit unit2 = eu.e;
                        if (oh0 == null) {
                            Intrinsics.checkNotNullParameter(oh0, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            JM<? super JsonElement> c5465nC0 = context == e.d ? new C5465nC0(completion) : new C5675oC0(completion, context);
                            F62.e(3, oh0);
                            objK = oh0.k(eu, unit2, c5465nC0);
                        } else {
                            F62.e(3, oh0);
                            objK = oh0.k(eu, unit2, completion);
                        }
                        if (objK != MN.d) {
                            completion.resumeWith(objK);
                        }
                    } catch (Throwable th) {
                        C1717Ot1.a aVar2 = C1717Ot1.e;
                        completion.resumeWith(C1795Pt1.a(th));
                    }
                } else {
                    eu.h = mn2;
                    completion.resumeWith(obj);
                }
            }
            C1795Pt1.b(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bG = abstractC4995l0.g((byte) 6);
            if (abstractC4995l0.w() == 4) {
                AbstractC4995l0.r(abstractC4995l0, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (abstractC4995l0.c()) {
                String strL = this.b ? abstractC4995l0.l() : abstractC4995l0.j();
                abstractC4995l0.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = abstractC4995l0.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    AbstractC4995l0.r(abstractC4995l0, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                abstractC4995l0.g((byte) 7);
            } else if (bG == 4) {
                C1874Qu.p(abstractC4995l0, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.c--;
        return jsonObject;
    }

    public final JsonArray c() {
        AbstractC4995l0 abstractC4995l0 = this.a;
        byte bF = abstractC4995l0.f();
        if (abstractC4995l0.w() == 4) {
            AbstractC4995l0.r(abstractC4995l0, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC4995l0.c()) {
            arrayList.add(b());
            bF = abstractC4995l0.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = abstractC4995l0.a;
                if (!z) {
                    AbstractC4995l0.r(abstractC4995l0, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            abstractC4995l0.g((byte) 9);
        } else if (bF == 4) {
            C1874Qu.p(abstractC4995l0, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z) {
        AbstractC4995l0 abstractC4995l0 = this.a;
        String strL = (this.b || !z) ? abstractC4995l0.l() : abstractC4995l0.j();
        return (z || !Intrinsics.a(strL, "null")) ? new C3959gH0(z, strL) : JsonNull.INSTANCE;
    }
}
