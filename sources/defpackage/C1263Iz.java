package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1263Iz extends C7576xG {

    @NotNull
    public final RL0 d;

    @NotNull
    public final C4612j90 e;

    @NotNull
    public final ZL0 f;

    @NotNull
    public final InterfaceC1131Hh g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final C6610sg0 j;

    /* JADX INFO: renamed from: Iz$a */
    @InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageViewModelBase$languageList$1", f = "ChangeLanguageViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<List<? extends UL0>, UL0, JM<? super List<? extends UL0>>, Object> {
        public /* synthetic */ List d;
        public /* synthetic */ UL0 e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            List<UL0> list = this.d;
            UL0 ul0 = this.e;
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            for (UL0 ul1 : list) {
                boolean zA = Intrinsics.a(ul1.g, ul0 != null ? ul0.g : null);
                String languageName = ul1.d;
                Intrinsics.checkNotNullParameter(languageName, "languageName");
                String languageTwoLettersRegionCode = ul1.e;
                Intrinsics.checkNotNullParameter(languageTwoLettersRegionCode, "languageTwoLettersRegionCode");
                String languageTwoLettersLanguageCode = ul1.g;
                Intrinsics.checkNotNullParameter(languageTwoLettersLanguageCode, "languageTwoLettersLanguageCode");
                String languageSelectionTitle = ul1.h;
                Intrinsics.checkNotNullParameter(languageSelectionTitle, "languageSelectionTitle");
                String languageSelectionSubTitle = ul1.i;
                Intrinsics.checkNotNullParameter(languageSelectionSubTitle, "languageSelectionSubTitle");
                String languageSelectionButtonNextText = ul1.j;
                Intrinsics.checkNotNullParameter(languageSelectionButtonNextText, "languageSelectionButtonNextText");
                String languageSelectionButtonConfirmText = ul1.k;
                Intrinsics.checkNotNullParameter(languageSelectionButtonConfirmText, "languageSelectionButtonConfirmText");
                arrayList.add(new UL0(languageName, languageTwoLettersRegionCode, languageTwoLettersLanguageCode, languageSelectionTitle, languageSelectionSubTitle, languageSelectionButtonNextText, languageSelectionButtonConfirmText, ul1.l, zA));
            }
            return arrayList;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(List<? extends UL0> list, UL0 ul0, JM<? super List<? extends UL0>> jm) {
            a aVar = new a(3, jm);
            aVar.d = list;
            aVar.e = ul0;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: Iz$b */
    @InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageViewModelBase$onInit$1", f = "ChangeLanguageViewModelBase.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public List d;
        public int e;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C1263Iz.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<UL0> list;
            MN mn = MN.d;
            int i = this.e;
            C1263Iz c1263Iz = C1263Iz.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                List<UL0> listB = c1263Iz.d.b();
                this.d = listB;
                this.e = 1;
                Object objP = C5189lv.p(C6266r20.c, new C1185Hz(listB, c1263Iz, null), this);
                if (objP == mn) {
                    return mn;
                }
                list = listB;
                obj = objP;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = this.d;
                C1795Pt1.b(obj);
            }
            c1263Iz.i.setValue((UL0) obj);
            UL0 ul0 = (UL0) c1263Iz.i.getValue();
            if (ul0 != null) {
                ArrayList arrayListF0 = CollectionsKt.f0(list);
                if (arrayListF0.size() > 1) {
                    C2680aF.n(arrayListF0, new C1341Jz());
                }
                arrayListF0.remove(ul0);
                arrayListF0.add(0, ul0);
                GP1 gp1 = c1263Iz.h;
                gp1.getClass();
                gp1.m(null, arrayListF0);
            }
            return Unit.a;
        }
    }

    public C1263Iz(@NotNull RL0 languages, @NotNull C4612j90 events, @NotNull ZL0 languageUseCaseApi, @NotNull InterfaceC1131Hh appRepositoryApi) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(languageUseCaseApi, "languageUseCaseApi");
        Intrinsics.checkNotNullParameter(appRepositoryApi, "appRepositoryApi");
        this.d = languages;
        this.e = events;
        this.f = languageUseCaseApi;
        this.g = appRepositoryApi;
        GP1 gp1I = C1589Ne.i(languages.b());
        this.h = gp1I;
        GP1 gp1I2 = C1589Ne.i(null);
        this.i = gp1I2;
        this.j = new C6610sg0(gp1I, gp1I2, new a(3, null));
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C5189lv.k(C8056za.j(this), C6266r20.a, new b(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[Catch: all -> 0x00ed, TryCatch #0 {, blocks: (B:40:0x00c8, B:41:0x00d0, B:43:0x00d9, B:45:0x00e7, B:46:0x00eb), top: B:58:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb A[EDGE_INSN: B:60:0x00eb->B:46:0x00eb BREAK  A[LOOP:0: B:41:0x00d0->B:62:0x00d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010c, code lost:
    
        if (r10.a(r2, r0) == r1) goto L53;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1263Iz.l(LM):java.lang.Object");
    }
}
