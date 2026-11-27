package com.impl.core.backend.data_sources;

import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.modelsResponse.AllAssetsResponse;
import defpackage.C1795Pt1;
import defpackage.C3735fC1;
import defpackage.C3836fh2;
import defpackage.C4466ii;
import defpackage.C5020l60;
import defpackage.C7683xl2;
import defpackage.Fg2;
import defpackage.G1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC5125ld;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.LM;
import defpackage.MN;
import defpackage.O3;
import defpackage.Vg2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AssetsDataSourceImpl extends G1 {

    @NotNull
    public final Vg2 e;

    @NotNull
    public final C3836fh2 f;

    @NotNull
    public final O3 g;

    public static final class a implements InterfaceC6396rf0<List<? extends AllAssetsResponse.AssetDto>> {
        public final /* synthetic */ b d;

        /* JADX INFO: renamed from: com.impl.core.backend.data_sources.AssetsDataSourceImpl$a$a, reason: collision with other inner class name */
        public static final class C0318a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: com.impl.core.backend.data_sources.AssetsDataSourceImpl$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssets$$inlined$filter$1$2", f = "AssetsDataSourceImpl.kt", l = {219}, m = "emit")
            public static final class C0319a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0319a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0318a.this.a(null, this);
                }
            }

            public C0318a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0319a c0319a;
                if (jm instanceof C0319a) {
                    c0319a = (C0319a) jm;
                    int i = c0319a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0319a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0319a = new C0319a(jm);
                    }
                } else {
                    c0319a = new C0319a(jm);
                }
                Object obj2 = c0319a.d;
                MN mn = MN.d;
                int i2 = c0319a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (!((List) obj).isEmpty()) {
                        c0319a.e = 1;
                        if (this.d.a(obj, c0319a) == mn) {
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

        public a(b bVar) {
            this.d = bVar;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends AllAssetsResponse.AssetDto>> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            Object objC = this.d.c(new C0318a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public static final class b implements InterfaceC6396rf0<List<? extends AllAssetsResponse.AssetDto>> {
        public final /* synthetic */ C3735fC1 d;
        public final /* synthetic */ Vg2 e;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ Vg2 e;

            /* JADX INFO: renamed from: com.impl.core.backend.data_sources.AssetsDataSourceImpl$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssets$$inlined$map$1$2", f = "AssetsDataSourceImpl.kt", l = {219}, m = "emit")
            public static final class C0320a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0320a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, Vg2 vg2) {
                this.d = interfaceC6606sf0;
                this.e = vg2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0320a c0320a;
                if (jm instanceof C0320a) {
                    c0320a = (C0320a) jm;
                    int i = c0320a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0320a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0320a = new C0320a(jm);
                    }
                } else {
                    c0320a = new C0320a(jm);
                }
                Object obj2 = c0320a.d;
                MN mn = MN.d;
                int i2 = c0320a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (T t : (List) obj) {
                        int i3 = Fg2.w;
                        this.e.getClass();
                        if (Fg2.p((AllAssetsResponse.AssetDto) t, "", "", AllAssetsResponse.AssetDto.NAME, null)) {
                            arrayList.add(t);
                        }
                    }
                    c0320a.e = 1;
                    if (this.d.a(arrayList, c0320a) == mn) {
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

        public b(C3735fC1 c3735fC1, Vg2 vg2) {
            this.d = c3735fC1;
            this.e = vg2;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends AllAssetsResponse.AssetDto>> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public AssetsDataSourceImpl(@NotNull Vg2 demoExecutor, @NotNull C3836fh2 realExecutor, @NotNull O3 selectedAccountUseCase) {
        Intrinsics.checkNotNullParameter(demoExecutor, "demoExecutor");
        Intrinsics.checkNotNullParameter(realExecutor, "realExecutor");
        Intrinsics.checkNotNullParameter(selectedAccountUseCase, "selectedAccountUseCase");
        this.e = demoExecutor;
        this.f = realExecutor;
        this.g = selectedAccountUseCase;
    }

    public static InterfaceC6396rf0 w(Vg2 vg2) {
        InterfaceC5125ld interfaceC5125ldF = vg2.F();
        InterfaceC6396rf0<? extends JsonElement> interfaceC6396rf0D = C7683xl2.b;
        if (interfaceC6396rf0D == null) {
            interfaceC6396rf0D = interfaceC5125ldF.d();
        }
        C7683xl2.b = interfaceC6396rf0D;
        return C4466ii.m(new a(new b(C7683xl2.c(new TypeToken<List<? extends AllAssetsResponse.AssetDto>>() { // from class: com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssets$$inlined$getRightMessagesFromList$default$1
        }, new TypeToken<AllAssetsResponse.AssetDto>() { // from class: com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssets$$inlined$getRightMessagesFromList$default$2
        }, AllAssetsResponse.AssetDto.NAME, C4466ii.x(interfaceC5125ldF.d(), C5020l60.d)), vg2)));
    }
}
