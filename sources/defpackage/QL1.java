package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class QL1 {

    @NotNull
    public final LinkedHashMap a = new LinkedHashMap();

    public final class a {

        @NotNull
        public final String a;
        public final /* synthetic */ QL1 b;

        /* JADX INFO: renamed from: QL1$a$a, reason: collision with other inner class name */
        public final class C0130a {

            @NotNull
            public final String a;

            @Nullable
            public final String b;

            @NotNull
            public final ArrayList c;

            @NotNull
            public Pair<String, C7755y62> d;

            public C0130a(@NotNull a aVar, @Nullable String functionName, String str) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.a = functionName;
                this.b = str;
                this.c = new ArrayList();
                this.d = new Pair<>("V", null);
            }

            public final void a(@NotNull String type, @NotNull C2905bF0... qualifiers) {
                C7755y62 c7755y62;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                ArrayList arrayList = this.c;
                if (qualifiers.length == 0) {
                    c7755y62 = null;
                } else {
                    Intrinsics.checkNotNullParameter(qualifiers, "<this>");
                    C1336Jx0 c1336Jx0 = new C1336Jx0(new C1449Lj(qualifiers, 0));
                    int iA = OW0.a(XE.m(c1336Jx0, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    Iterator it = c1336Jx0.iterator();
                    while (true) {
                        C1414Kx0 c1414Kx0 = (C1414Kx0) it;
                        if (!c1414Kx0.d.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.a), (C2905bF0) indexedValue.b);
                    }
                    c7755y62 = new C7755y62(linkedHashMap);
                }
                arrayList.add(new Pair(type, c7755y62));
            }

            public final void b(@NotNull DI0 type) {
                Intrinsics.checkNotNullParameter(type, "type");
                String strF = type.f();
                Intrinsics.checkNotNullExpressionValue(strF, "getDesc(...)");
                this.d = new Pair<>(strF, null);
            }

            public final void c(@NotNull String type, @NotNull C2905bF0... qualifiers) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                Intrinsics.checkNotNullParameter(qualifiers, "<this>");
                C1336Jx0 c1336Jx0 = new C1336Jx0(new C1449Lj(qualifiers, 0));
                int iA = OW0.a(XE.m(c1336Jx0, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it = c1336Jx0.iterator();
                while (true) {
                    C1414Kx0 c1414Kx0 = (C1414Kx0) it;
                    if (!c1414Kx0.d.hasNext()) {
                        this.d = new Pair<>(type, new C7755y62(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.a), (C2905bF0) indexedValue.b);
                    }
                }
            }
        }

        public a(@NotNull QL1 ql1, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.b = ql1;
            this.a = className;
        }

        public final void a(@NotNull String name, @Nullable String str, @NotNull Function1<? super C0130a, Unit> block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            LinkedHashMap linkedHashMap = this.b.a;
            C0130a c0130a = new C0130a(this, name, str);
            block.invoke(c0130a);
            ArrayList arrayList = c0130a.c;
            ArrayList parameters = new ArrayList(XE.m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parameters.add((String) ((Pair) it.next()).d);
            }
            String ret = c0130a.d.d;
            String name2 = c0130a.a;
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(ret, "ret");
            StringBuilder sb = new StringBuilder();
            sb.append(name2);
            sb.append('(');
            sb.append(CollectionsKt.J(parameters, "", null, null, RB.h, 30));
            sb.append(')');
            if (ret.length() > 1) {
                ret = C1742Pc.d(';', "L", ret);
            }
            sb.append(ret);
            String jvmDescriptor = sb.toString();
            String internalName = this.a;
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
            String str2 = internalName + JwtParser.SEPARATOR_CHAR + jvmDescriptor;
            C7755y62 c7755y62 = c0130a.d.e;
            ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add((C7755y62) ((Pair) it2.next()).e);
            }
            linkedHashMap.put(str2, new C4929kg1(c7755y62, arrayList2, c0130a.b));
        }
    }
}
