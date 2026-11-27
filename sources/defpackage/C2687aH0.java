package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", l = {}, m = "invokeSuspend")
public final class C2687aH0 extends AW1 implements Function2<KN, JM<? super Sequence<? extends Object>>, Object> {
    public final /* synthetic */ InterfaceC0942Ew d;
    public final /* synthetic */ A62 e;
    public final /* synthetic */ AbstractC5267mG0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2687aH0(InterfaceC0942Ew interfaceC0942Ew, A62 a62, AbstractC5267mG0 abstractC5267mG0, JM<? super C2687aH0> jm) {
        super(2, jm);
        this.d = interfaceC0942Ew;
        this.e = a62;
        this.g = abstractC5267mG0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C2687aH0(this.d, this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Sequence<? extends Object>> jm) {
        return ((C2687aH0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EnumC7408wU enumC7408wU;
        Object c3539eH0;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        KW1 kw1 = C4295ht.a;
        InterfaceC0942Ew interfaceC0942Ew = this.d;
        Intrinsics.checkNotNullParameter(interfaceC0942Ew, "<this>");
        AA0 stream = new AA0(null, interfaceC0942Ew);
        A62 a62B = C5207m.b(this.e);
        AbstractC5267mG0 json = this.g;
        RJ0 deserializer = C5027l8.w(json.b, a62B);
        EnumC7408wU mode = EnumC7408wU.g;
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(mode, "format");
        PE0 reader = new PE0(stream);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(mode, "format");
        C1385Kn1 lexer = new C1385Kn1(reader, new char[16384]);
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (lexer.w() == 8) {
            lexer.g((byte) 8);
            enumC7408wU = EnumC7408wU.e;
        } else {
            enumC7408wU = EnumC7408wU.d;
        }
        int iOrdinal = enumC7408wU.ordinal();
        if (iOrdinal == 0) {
            c3539eH0 = new C3539eH0(json, lexer, deserializer);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C6489s51();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
            }
            c3539eH0 = new C3330dH0(json, lexer, deserializer);
        }
        return FH1.b(new EH0(c3539eH0, 0));
    }
}
