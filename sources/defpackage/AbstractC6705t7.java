package defpackage;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6705t7 {

    @NotNull
    public final LinkedHashMap a = new LinkedHashMap();

    @NotNull
    public final LinkedHashMap b = new LinkedHashMap();

    @NotNull
    public final LinkedHashMap c = new LinkedHashMap();

    @NotNull
    public final ArrayList d = new ArrayList();

    @NotNull
    public final transient LinkedHashMap e = new LinkedHashMap();

    @NotNull
    public final LinkedHashMap f = new LinkedHashMap();

    @NotNull
    public final Bundle g = new Bundle();

    /* JADX INFO: renamed from: t7$a */
    public static final class a<O> {

        @NotNull
        public final InterfaceC4813k7<O> a;

        @NotNull
        public final AbstractC5023l7<?, O> b;

        public a(@NotNull AbstractC5023l7 contract, @NotNull InterfaceC4813k7 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.a = callback;
            this.b = contract;
        }
    }

    /* JADX INFO: renamed from: t7$b */
    public static final class b {

        @NotNull
        public final g a;

        @NotNull
        public final ArrayList b;

        public b(@NotNull g lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.a = lifecycle;
            this.b = new ArrayList();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, @org.jetbrains.annotations.Nullable android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.LinkedHashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            t7$a r0 = (defpackage.AbstractC6705t7.a) r0
            if (r0 == 0) goto L1d
            k7<O> r1 = r0.a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            k7<O> r2 = r0.a
            l7<?, O> r0 = r0.b
            java.lang.Object r5 = r0.c(r5, r6)
            r2.b(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f
            r0.remove(r4)
            j7 r0 = new j7
            r0.<init>(r5, r6)
            android.os.Bundle r5 = r3.g
            r5.putParcelable(r4, r0)
        L46:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6705t7.a(int, int, android.content.Intent):boolean");
    }

    public abstract void b(int i, @NotNull AbstractC5023l7 abstractC5023l7, Object obj);

    @NotNull
    public final C7125v7 c(@NotNull final String key, @NotNull FP0 lifecycleOwner, @NotNull final AbstractC5023l7 contract, @NotNull final InterfaceC4813k7 callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        g lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().b(g.b.h)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.c;
        b bVar = (b) linkedHashMap.get(key);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        k observer = new k() { // from class: r7
            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a event) {
                AbstractC6705t7 this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String key2 = key;
                Intrinsics.checkNotNullParameter(key2, "$key");
                InterfaceC4813k7 callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                AbstractC5023l7 contract2 = contract;
                Intrinsics.checkNotNullParameter(contract2, "$contract");
                Intrinsics.checkNotNullParameter(fp0, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (g.a.ON_START != event) {
                    if (g.a.ON_STOP == event) {
                        this$0.e.remove(key2);
                        return;
                    } else {
                        if (g.a.ON_DESTROY == event) {
                            this$0.f(key2);
                            return;
                        }
                        return;
                    }
                }
                this$0.e.put(key2, new AbstractC6705t7.a(contract2, callback2));
                LinkedHashMap linkedHashMap2 = this$0.f;
                if (linkedHashMap2.containsKey(key2)) {
                    Object obj = linkedHashMap2.get(key2);
                    linkedHashMap2.remove(key2);
                    callback2.b(obj);
                }
                Bundle bundle = this$0.g;
                C4603j7 c4603j7 = (C4603j7) C1562Mv.a(key2, bundle);
                if (c4603j7 != null) {
                    bundle.remove(key2);
                    callback2.b(contract2.c(c4603j7.d, c4603j7.e));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        bVar.a.a(observer);
        bVar.b.add(observer);
        linkedHashMap.put(key, bVar);
        return new C7125v7(this, key, contract);
    }

    @NotNull
    public final C7335w7 d(@NotNull String key, @NotNull AbstractC5023l7 contract, @NotNull InterfaceC4813k7 callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(key);
        this.e.put(key, new a(contract, callback));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.b(obj);
        }
        Bundle bundle = this.g;
        C4603j7 c4603j7 = (C4603j7) C1562Mv.a(key, bundle);
        if (c4603j7 != null) {
            bundle.remove(key);
            callback.b(contract.c(c4603j7.d, c4603j7.e));
        }
        return new C7335w7(this, key, contract);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : FH1.d(C6915u7.d)) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(@NotNull String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.d.contains(key) && (num = (Integer) this.b.remove(key)) != null) {
            this.a.remove(num);
        }
        this.e.remove(key);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbB = C6495s7.b("Dropping pending result for request ", key, ": ");
            sbB.append(linkedHashMap.get(key));
            b0.e("ActivityResultRegistry", sbB.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(key)) {
            b0.e("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4603j7) C1562Mv.a(key, bundle)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b bVar = (b) linkedHashMap2.get(key);
        if (bVar != null) {
            ArrayList arrayList = bVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.a.c((k) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
