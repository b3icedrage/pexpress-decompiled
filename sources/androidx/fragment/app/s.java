package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.pexpress.tool.R;
import defpackage.C5345me2;
import defpackage.C6495s7;
import defpackage.C6585sa;
import defpackage.C7300vy;
import defpackage.Cd2;
import defpackage.EK;
import defpackage.InterfaceC5922pO1;
import defpackage.RunnableC8084zh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    @NotNull
    public final ViewGroup a;

    @NotNull
    public final ArrayList b;

    @NotNull
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public static final class a extends b {

        @NotNull
        public final o h;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@NotNull b.EnumC0232b finalState, @NotNull b.a lifecycleImpact, @NotNull o fragmentStateManager, @NotNull C7300vy cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Fragment fragment = fragmentStateManager.c;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragment, cancellationSignal);
            this.h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.s.b
        public final void b() {
            super.b();
            this.h.i();
        }

        @Override // androidx.fragment.app.s.b
        public final void d() {
            b.a aVar = this.b;
            b.a aVar2 = b.a.e;
            o oVar = this.h;
            if (aVar != aVar2) {
                if (aVar == b.a.g) {
                    Fragment fragment = oVar.c;
                    Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.G(2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragment.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = oVar.c;
            Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.G(2)) {
                    viewFindFocus.toString();
                    fragment2.toString();
                }
            }
            View viewRequireView2 = this.c.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                oVar.a();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public static class b {

        @NotNull
        public EnumC0232b a;

        @NotNull
        public a b;

        @NotNull
        public final Fragment c;

        @NotNull
        public final ArrayList d;

        @NotNull
        public final LinkedHashSet e;
        public boolean f;
        public boolean g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a d;
            public static final a e;
            public static final a g;
            public static final /* synthetic */ a[] h;

            static {
                a aVar = new a("NONE", 0);
                d = aVar;
                a aVar2 = new a("ADDING", 1);
                e = aVar2;
                a aVar3 = new a("REMOVING", 2);
                g = aVar3;
                h = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) h.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.fragment.app.s$b$b, reason: collision with other inner class name */
        public static final class EnumC0232b {
            public static final EnumC0232b d;
            public static final EnumC0232b e;
            public static final EnumC0232b g;
            public static final EnumC0232b h;
            public static final /* synthetic */ EnumC0232b[] i;

            static {
                EnumC0232b enumC0232b = new EnumC0232b("REMOVED", 0);
                d = enumC0232b;
                EnumC0232b enumC0232b2 = new EnumC0232b("VISIBLE", 1);
                e = enumC0232b2;
                EnumC0232b enumC0232b3 = new EnumC0232b("GONE", 2);
                g = enumC0232b3;
                EnumC0232b enumC0232b4 = new EnumC0232b("INVISIBLE", 3);
                h = enumC0232b4;
                i = new EnumC0232b[]{enumC0232b, enumC0232b2, enumC0232b3, enumC0232b4};
            }

            public EnumC0232b() {
                throw null;
            }

            public static EnumC0232b valueOf(String str) {
                return (EnumC0232b) Enum.valueOf(EnumC0232b.class, str);
            }

            public static EnumC0232b[] values() {
                return (EnumC0232b[]) i.clone();
            }

            public final void b(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.G(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.G(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (iOrdinal == 2) {
                    if (FragmentManager.G(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    if (FragmentManager.G(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public b(@NotNull EnumC0232b finalState, @NotNull a lifecycleImpact, @NotNull Fragment fragment, @NotNull C7300vy cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.a = finalState;
            this.b = lifecycleImpact;
            this.c = fragment;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            cancellationSignal.a(new C6585sa(this));
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            for (C7300vy c7300vy : CollectionsKt.g0(linkedHashSet)) {
                synchronized (c7300vy) {
                    try {
                        if (!c7300vy.a) {
                            c7300vy.a = true;
                            c7300vy.c = true;
                            C7300vy.a aVar = c7300vy.b;
                            if (aVar != null) {
                                try {
                                    aVar.a();
                                } catch (Throwable th) {
                                    synchronized (c7300vy) {
                                        c7300vy.c = false;
                                        c7300vy.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (c7300vy) {
                                c7300vy.c = false;
                                c7300vy.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public void b() {
            if (this.g) {
                return;
            }
            if (FragmentManager.G(2)) {
                toString();
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(@NotNull EnumC0232b finalState, @NotNull a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int iOrdinal = lifecycleImpact.ordinal();
            EnumC0232b enumC0232b = EnumC0232b.d;
            Fragment fragment = this.c;
            if (iOrdinal == 0) {
                if (this.a != enumC0232b) {
                    if (FragmentManager.G(2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.a);
                        Objects.toString(finalState);
                    }
                    this.a = finalState;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.a == enumC0232b) {
                    if (FragmentManager.G(2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.b);
                    }
                    this.a = EnumC0232b.e;
                    this.b = a.e;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.G(2)) {
                Objects.toString(fragment);
                Objects.toString(this.a);
                Objects.toString(this.b);
            }
            this.a = enumC0232b;
            this.b = a.g;
        }

        public void d() {
        }

        @NotNull
        public final String toString() {
            StringBuilder sbB = C6495s7.b("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbB.append(this.a);
            sbB.append(" lifecycleImpact = ");
            sbB.append(this.b);
            sbB.append(" fragment = ");
            sbB.append(this.c);
            sbB.append('}');
            return sbB.toString();
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public s(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @NotNull
    public static final s f(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        InterfaceC5922pO1 factory = fragmentManager.F();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof s) {
            return (s) tag;
        }
        ((FragmentManager.e) factory).getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        d dVar = new d(container);
        Intrinsics.checkNotNullExpressionValue(dVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, dVar);
        return dVar;
    }

    public final void a(b.EnumC0232b enumC0232b, b.a aVar, o oVar) {
        synchronized (this.b) {
            C7300vy c7300vy = new C7300vy();
            Fragment fragment = oVar.c;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            b bVarD = d(fragment);
            if (bVarD != null) {
                bVarD.c(enumC0232b, aVar);
                return;
            }
            final a aVar2 = new a(enumC0232b, aVar, oVar, c7300vy);
            this.b.add(aVar2);
            Runnable listener = new Runnable() { // from class: androidx.fragment.app.r
                @Override // java.lang.Runnable
                public final void run() {
                    s this$0 = this.d;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    s.a operation = aVar2;
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    if (this$0.b.contains(operation)) {
                        s.b.EnumC0232b enumC0232b2 = operation.a;
                        View view = operation.c.mView;
                        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                        enumC0232b2.b(view);
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            aVar2.d.add(listener);
            RunnableC8084zh listener2 = new RunnableC8084zh(1, this, aVar2);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            aVar2.d.add(listener2);
            Unit unit = Unit.a;
        }
    }

    public abstract void b(@NotNull ArrayList arrayList, boolean z);

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList<b> arrayListF0 = CollectionsKt.f0(this.c);
                    this.c.clear();
                    for (b bVar : arrayListF0) {
                        if (FragmentManager.G(2)) {
                            Objects.toString(bVar);
                        }
                        bVar.a();
                        if (!bVar.g) {
                            this.c.add(bVar);
                        }
                    }
                    h();
                    ArrayList arrayListF1 = CollectionsKt.f0(this.b);
                    this.b.clear();
                    this.c.addAll(arrayListF1);
                    FragmentManager.G(2);
                    Iterator it = arrayListF1.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).d();
                    }
                    b(arrayListF1, this.d);
                    this.d = false;
                    FragmentManager.G(2);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b d(Fragment fragment) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            b bVar = (b) next;
            if (Intrinsics.a(bVar.c, fragment) && !bVar.f) {
                return (b) next;
            }
        }
        next = null;
        return (b) next;
    }

    public final void e() {
        FragmentManager.G(2);
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                h();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d();
                }
                for (b bVar : CollectionsKt.f0(this.c)) {
                    if (FragmentManager.G(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(bVar);
                    }
                    bVar.a();
                }
                for (b bVar2 : CollectionsKt.f0(this.b)) {
                    if (FragmentManager.G(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(bVar2);
                    }
                    bVar2.a();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Object objPrevious;
        b.EnumC0232b enumC0232b;
        synchronized (this.b) {
            try {
                h();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    b bVar = (b) objPrevious;
                    View view = bVar.c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        enumC0232b = b.EnumC0232b.h;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            enumC0232b = b.EnumC0232b.e;
                        } else if (visibility == 4) {
                            enumC0232b = b.EnumC0232b.h;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            enumC0232b = b.EnumC0232b.g;
                        }
                    }
                    b.EnumC0232b enumC0232b2 = bVar.a;
                    b.EnumC0232b enumC0232b3 = b.EnumC0232b.e;
                    if (enumC0232b2 == enumC0232b3 && enumC0232b != enumC0232b3) {
                        break;
                    }
                }
                b bVar2 = (b) objPrevious;
                Fragment fragment = bVar2 != null ? bVar2.c : null;
                this.e = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        b.EnumC0232b enumC0232b;
        for (b bVar : this.b) {
            if (bVar.b == b.a.e) {
                View viewRequireView = bVar.c.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    enumC0232b = b.EnumC0232b.e;
                } else if (visibility == 4) {
                    enumC0232b = b.EnumC0232b.h;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(EK.e(visibility, "Unknown visibility "));
                    }
                    enumC0232b = b.EnumC0232b.g;
                }
                bVar.c(enumC0232b, b.a.d);
            }
        }
    }
}
