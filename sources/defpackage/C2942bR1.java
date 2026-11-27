package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2942bR1 implements InterfaceC7295vw0, InterfaceC2718aR1 {

    @NotNull
    public final C7652xe a;

    @NotNull
    public final GO b;

    @NotNull
    public final KW1 c;

    @NotNull
    public final b d;

    @NotNull
    public final KW1 e;

    /* JADX INFO: renamed from: bR1$a */
    public /* synthetic */ class a extends C2784ak0 implements Function1<String, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String p0 = str;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C2942bR1) this.e).getClass();
            return "https://assets.pbotservices.com/images/stories/new/" + p0 + "_cover.png";
        }
    }

    /* JADX INFO: renamed from: bR1$b */
    public static final class b implements InterfaceC6396rf0<List<? extends C0615Ar>> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ C2942bR1 e;

        /* JADX INFO: renamed from: bR1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C2942bR1 e;

            /* JADX INFO: renamed from: bR1$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.stories.repositories.StoriesRepositoryBase$special$$inlined$map$1$2", f = "StoriesRepositoryBase.kt", l = {219}, m = "emit")
            public static final class C0250a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0250a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, C2942bR1 c2942bR1) {
                this.d = interfaceC6606sf0;
                this.e = c2942bR1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0250a c0250a;
                if (jm instanceof C0250a) {
                    c0250a = (C0250a) jm;
                    int i = c0250a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0250a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0250a = new C0250a(jm);
                    }
                } else {
                    c0250a = new C0250a(jm);
                }
                Object obj2 = c0250a.d;
                MN mn = MN.d;
                int i2 = c0250a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Set set = (Set) obj;
                    C2942bR1 c2942bR1 = this.e;
                    List list = (List) c2942bR1.c.getValue();
                    ArrayList arrayList = new ArrayList(XE.m(list, 10));
                    int i3 = 0;
                    for (T t : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            WE.l();
                            throw null;
                        }
                        C0615Ar c0615Ar = (C0615Ar) t;
                        c2942bR1.a.getClass();
                        boolean zContains = set.contains("images.stories." + i3);
                        int i5 = c0615Ar.a;
                        String backgroundUrl = c0615Ar.b;
                        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
                        arrayList.add(new C0615Ar(backgroundUrl, i5, zContains));
                        i3 = i4;
                    }
                    c0250a.e = 1;
                    if (this.d.a(arrayList, c0250a) == mn) {
                        return mn;
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

        public b(InterfaceC6396rf0 interfaceC6396rf0, C2942bR1 c2942bR1) {
            this.d = interfaceC6396rf0;
            this.e = c2942bR1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C0615Ar>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C2942bR1(@NotNull C7652xe storiesIdsProvider, @NotNull AL1 shownStoriesUseCase, @NotNull GO coversProvider) {
        Intrinsics.checkNotNullParameter(storiesIdsProvider, "storiesIdsProvider");
        Intrinsics.checkNotNullParameter(shownStoriesUseCase, "shownStoriesUseCase");
        Intrinsics.checkNotNullParameter(coversProvider, "coversProvider");
        this.a = storiesIdsProvider;
        this.b = coversProvider;
        this.c = XO0.b(new C7121v6(this, 6));
        this.d = new b(shownStoriesUseCase.getValue(), this);
        this.e = XO0.b(new C4927kg(this, 6));
    }

    public static String c(String str) {
        return C1039Gc0.d("https://assets.pbotservices.com/images/stories/new/", str, ".png");
    }

    @Override // defpackage.InterfaceC2718aR1
    @NotNull
    public final List<List<C3151cR1>> a() {
        return (List) this.e.getValue();
    }

    @Override // defpackage.InterfaceC2718aR1
    @NotNull
    public final b b() {
        return this.d;
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() {
        CQ0 cq0B = VE.b();
        List list = (List) this.c.getValue();
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0615Ar) it.next()).b);
        }
        cq0B.addAll(arrayList);
        Iterator<T> it2 = a().iterator();
        while (it2.hasNext()) {
            List list2 = (List) it2.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                String str = ((C3151cR1) it3.next()).e;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            cq0B.addAll(arrayList2);
        }
        return new C1021Fw0(VE.a(cq0B), null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return EnumC7035uh1.h;
    }
}
