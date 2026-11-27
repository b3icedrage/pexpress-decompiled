package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C1480Lt1;
import defpackage.C5208m0;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.C7892yl1;
import defpackage.DN;
import defpackage.ExecutorC6057q20;
import defpackage.InterfaceC1233Ip;
import defpackage.InterfaceC3246ct;
import defpackage.InterfaceC5056lH;
import defpackage.InterfaceC5873p82;
import defpackage.PP0;
import defpackage.UG;
import defpackage.WE;
import defpackage.Y90;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LUG;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements InterfaceC5056lH {
        public static final a<T> d = new a<>();

        @Override // defpackage.InterfaceC5056lH
        public final Object c(C1480Lt1 c1480Lt1) {
            Object objG = c1480Lt1.g(new C7892yl1<>(InterfaceC1233Ip.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            Executor executor = (Executor) objG;
            boolean z = executor instanceof ExecutorC6057q20;
            return new Y90(executor);
        }
    }

    public static final class b<T> implements InterfaceC5056lH {
        public static final b<T> d = new b<>();

        @Override // defpackage.InterfaceC5056lH
        public final Object c(C1480Lt1 c1480Lt1) {
            Object objG = c1480Lt1.g(new C7892yl1<>(PP0.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            Executor executor = (Executor) objG;
            boolean z = executor instanceof ExecutorC6057q20;
            return new Y90(executor);
        }
    }

    public static final class c<T> implements InterfaceC5056lH {
        public static final c<T> d = new c<>();

        @Override // defpackage.InterfaceC5056lH
        public final Object c(C1480Lt1 c1480Lt1) {
            Object objG = c1480Lt1.g(new C7892yl1<>(InterfaceC3246ct.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            Executor executor = (Executor) objG;
            boolean z = executor instanceof ExecutorC6057q20;
            return new Y90(executor);
        }
    }

    public static final class d<T> implements InterfaceC5056lH {
        public static final d<T> d = new d<>();

        @Override // defpackage.InterfaceC5056lH
        public final Object c(C1480Lt1 c1480Lt1) {
            Object objG = c1480Lt1.g(new C7892yl1<>(InterfaceC5873p82.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            Executor executor = (Executor) objG;
            boolean z = executor instanceof ExecutorC6057q20;
            return new Y90(executor);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<UG<?>> getComponents() {
        UG<?> ugA = C6973uP0.a("fire-core-ktx", "20.3.1");
        C7892yl1 c7892yl1 = new C7892yl1(InterfaceC1233Ip.class, DN.class);
        C7892yl1[] c7892yl1Arr = new C7892yl1[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c7892yl1);
        for (C7892yl1 c7892yl2 : c7892yl1Arr) {
            C5208m0.f(c7892yl2, "Null interface");
        }
        Collections.addAll(hashSet, c7892yl1Arr);
        C6996uX c6996uX = new C6996uX((C7892yl1<?>) new C7892yl1(InterfaceC1233Ip.class, Executor.class), 1, 0);
        if (hashSet.contains(c6996uX.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(c6996uX);
        UG ug = new UG(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, a.d, hashSet3);
        Intrinsics.checkNotNullExpressionValue(ug, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C7892yl1 c7892yl3 = new C7892yl1(PP0.class, DN.class);
        C7892yl1[] c7892yl1Arr2 = new C7892yl1[0];
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c7892yl3);
        for (C7892yl1 c7892yl4 : c7892yl1Arr2) {
            C5208m0.f(c7892yl4, "Null interface");
        }
        Collections.addAll(hashSet4, c7892yl1Arr2);
        C6996uX c6996uX2 = new C6996uX((C7892yl1<?>) new C7892yl1(PP0.class, Executor.class), 1, 0);
        if (hashSet4.contains(c6996uX2.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet5.add(c6996uX2);
        UG ug2 = new UG(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, b.d, hashSet6);
        Intrinsics.checkNotNullExpressionValue(ug2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C7892yl1 c7892yl5 = new C7892yl1(InterfaceC3246ct.class, DN.class);
        C7892yl1[] c7892yl1Arr3 = new C7892yl1[0];
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c7892yl5);
        for (C7892yl1 c7892yl6 : c7892yl1Arr3) {
            C5208m0.f(c7892yl6, "Null interface");
        }
        Collections.addAll(hashSet7, c7892yl1Arr3);
        C6996uX c6996uX3 = new C6996uX((C7892yl1<?>) new C7892yl1(InterfaceC3246ct.class, Executor.class), 1, 0);
        if (hashSet7.contains(c6996uX3.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet8.add(c6996uX3);
        UG ug3 = new UG(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, c.d, hashSet9);
        Intrinsics.checkNotNullExpressionValue(ug3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C7892yl1 c7892yl7 = new C7892yl1(InterfaceC5873p82.class, DN.class);
        C7892yl1[] c7892yl1Arr4 = new C7892yl1[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(c7892yl7);
        for (C7892yl1 c7892yl8 : c7892yl1Arr4) {
            C5208m0.f(c7892yl8, "Null interface");
        }
        Collections.addAll(hashSet10, c7892yl1Arr4);
        C6996uX c6996uX4 = new C6996uX((C7892yl1<?>) new C7892yl1(InterfaceC5873p82.class, Executor.class), 1, 0);
        if (hashSet10.contains(c6996uX4.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet11.add(c6996uX4);
        UG ug4 = new UG(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, d.d, hashSet12);
        Intrinsics.checkNotNullExpressionValue(ug4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return WE.f(ugA, ug, ug2, ug3, ug4);
    }
}
