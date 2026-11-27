package com.api.core.backend.domain.models.resultModels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1795Pt1;
import defpackage.C4718jg0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.LM;
import defpackage.MN;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lrf0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonResultKt$okFilter$$inlined$filterIsInstance$1 implements InterfaceC6396rf0<Object> {
    final /* synthetic */ InterfaceC6396rf0 $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;LJM;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass2<T> implements InterfaceC6606sf0 {
        final /* synthetic */ InterfaceC6606sf0 $this_unsafeFlow;

        /* JADX INFO: renamed from: com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
        @InterfaceC3368dU(c = "com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1$2", f = "CommonResult.kt", l = {223}, m = "emit")
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass1 extends LM {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.a(null, this);
            }
        }

        public AnonymousClass2(InterfaceC6606sf0 interfaceC6606sf0) {
            this.$this_unsafeFlow = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            AnonymousClass1 anonymousClass1;
            if (jm instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) jm;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(jm);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(jm);
            }
            Object obj2 = anonymousClass1.result;
            MN mn = MN.d;
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                InterfaceC6606sf0 interfaceC6606sf0 = this.$this_unsafeFlow;
                if (obj instanceof ResultOk) {
                    anonymousClass1.label = 1;
                    if (interfaceC6606sf0.a(obj, anonymousClass1) == mn) {
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

    public CommonResultKt$okFilter$$inlined$filterIsInstance$1(C4718jg0 c4718jg0) {
        this.$this_unsafeTransform$inlined = c4718jg0;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.$this_unsafeTransform$inlined.c(new AnonymousClass2(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
