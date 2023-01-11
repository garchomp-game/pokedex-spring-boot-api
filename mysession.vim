let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/workspace/pokemon_community_app/myapp
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +45 src/main/java/com/example/myapp/controller/PokedexController.java
badd +1704 src/main/resources/pokedex/pokedex/pokedex.json
badd +1 src/main/java/com/example/myapp/factory/JsonPropertySourceFactory.java
badd +3 src/main/java/com/example/myapp/property/PokemonNameList.java
badd +9 src/main/java/com/example/myapp/property/MegaEvolution.java
badd +7 src/main/java/com/example/myapp/property/MegaEvolutionName.java
badd +4 src/main/java/com/example/myapp/property/Pokedex.java
badd +7 src/main/java/com/example/myapp/property/PokedexBase.java
badd +9 src/main/java/com/example/myapp/property/GigaEvolution.java
badd +7 src/main/java/com/example/myapp/property/GigaEvolutionName.java
badd +10 src/main/java/com/example/myapp/interface/PropertyInterface.java
badd +1 .
badd +3 src/main/java/com/example/myapp/property/GigantaMax.java
badd +3 src/main/java/com/example/myapp/property/GigantaMaxNameList.java
badd +3 src/main/java/com/example/myapp/property/MegaEvolutionNameList.java
argglobal
%argdel
$argadd src/main/java/com/example/myapp/property/GigantaMax.java
$argadd src/main/java/com/example/myapp/property/GigantaMaxNameList.java
$argadd src/main/java/com/example/myapp/property/MegaEvolution.java
$argadd src/main/java/com/example/myapp/property/MegaEvolutionNameList.java
$argadd src/main/java/com/example/myapp/property/Pokedex.java
$argadd src/main/java/com/example/myapp/property/PokedexBase.java
$argadd src/main/java/com/example/myapp/property/PokemonNameList.java
set lines=49 columns=191
edit src/main/java/com/example/myapp/controller/PokedexController.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
argglobal
7argu
if bufexists(fnamemodify("src/main/java/com/example/myapp/controller/PokedexController.java", ":p")) | buffer src/main/java/com/example/myapp/controller/PokedexController.java | else | edit src/main/java/com/example/myapp/controller/PokedexController.java | endif
if &buftype ==# 'terminal'
  silent file src/main/java/com/example/myapp/controller/PokedexController.java
endif
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 45 - ((42 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 45
normal! 065|
wincmd w
argglobal
7argu
if bufexists(fnamemodify("src/main/java/com/example/myapp/property/MegaEvolution.java", ":p")) | buffer src/main/java/com/example/myapp/property/MegaEvolution.java | else | edit src/main/java/com/example/myapp/property/MegaEvolution.java | endif
if &buftype ==# 'terminal'
  silent file src/main/java/com/example/myapp/property/MegaEvolution.java
endif
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 9 - ((8 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 9
normal! 021|
wincmd w
2wincmd w
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
tabnext 1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let &winminheight = s:save_winminheight
let &winminwidth = s:save_winminwidth
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
nohlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
