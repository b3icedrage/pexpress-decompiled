package defpackage;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {74, 78}, m = "deserialize")
public final class C7171vL0 extends LM {
    public AL0 d;
    public Charset e;
    public Object g;
    public InterfaceC0942Ew h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AL0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7171vL0(AL0 al0, LM lm) {
        super(lm);
        this.j = al0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, null, this);
    }
}
