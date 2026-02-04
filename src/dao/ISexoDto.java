/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.SexoModel;

/**
 *
 * @author pamela
 */
public interface ISexoDto {
    public void criarTabelaSexo();
    public void cargaTabelaSexo();
    public List<SexoModel> BuscarSexo();
}
